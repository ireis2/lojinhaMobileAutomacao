package Modulos.Produtos;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import telas.LoginTela;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


@DisplayName("Testes Mobile do Modulo Produto")
public class ProdutoTest {
    private WebDriver app;

    @BeforeEach
    public void beforEach() throws MalformedURLException {
        //Abrir  o app
        DesiredCapabilities capacidades = new DesiredCapabilities();
        capacidades.setCapability("deviceName", "Google Pixel 3");
        capacidades.setCapability("platform", "Android");
        capacidades.setCapability("udid", "192.168.143.101:5555");
        capacidades.setCapability("appPackage", "com.lojinha");
        capacidades.setCapability("appActivity", "com.lojinha.ui.MainActivity");
        capacidades.setCapability("app", "C:\\WorkSpace\\Treinamentos\\PTQS\\LojinhaAndroid\\lojinha-nativa.apk");

        this.app = new RemoteWebDriver(new URL("http:/127.0.0.1:4723/wd/hub"), capacidades);
        this.app.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @DisplayName("Validação de Valor de produto não permitido")
    @Test
    public void testValidacaoValorDeProdutoNaoPermitido() {

        String mensagemAprensetada = new LoginTela(app)
                .preencherUsuario("admin")
                .preencherSenha("admin")
                .submeterLogin()
                .abrirTelaAdicaoProduto()
                .preencherNomeProduto("iphone")
                .preencherValorProduto("700001")
                .preencherCoresProduto("azul, roxo")
                .submissaoComErro()
                .obterMensagemDeErro();


        //Validar que a mensagem de valor invádo foi apresentada
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemAprensetada);

    }
    @AfterEach
    public void afterEach(){
        app.quit();
    }
}