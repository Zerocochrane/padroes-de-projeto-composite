import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArquivoCompositeTest {
    @Test
    void deveRetornarVideo() throws Exception {
        ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
        ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
        ArquivoComponent outroVideo = new ArquivoVideo("serieS01E01.mkv");


        minhaPasta.adicionar(meuVideo);
        minhaPasta.adicionar(outroVideo);
        minhaPasta.printNomeDoArquivo();

        assertEquals("meu video.avi", minhaPasta.getArquivo(meuVideo.getNomeDoArquivo()).printNomeDoArquivo());
    }
}