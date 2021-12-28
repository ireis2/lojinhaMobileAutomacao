package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioAdicaoProdutosTela extends BaseTela {

    public FormularioAdicaoProdutosTela(WebDriver app) {
        super(app);
    }

    //Cadastrar produto com valor inválido
    public FormularioAdicaoProdutosTela preencherNomeProduto(String produtoNome) {
        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(produtoNome);

        return this;
    }
    public FormularioAdicaoProdutosTela preencherValorProduto(String valorProduto) {
        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);

        return this;
    }
    public FormularioAdicaoProdutosTela preencherCoresProduto(String cores) {
        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(cores);

        return this;
    }
    public FormularioAdicaoProdutosTela submissaoComErro() {
        app.findElement(By.id("com.lojinha:id/saveButton")).click();


        return this;
    }
    public String obterMensagemDeErro(){
        return capturarToast();

    }
}
