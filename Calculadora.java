package calculadora;

import javax.swing.JOptionPane;

/*
 * @author Luis Carlos Oliveira da Silva
 */

public class Calculadora {

    public static void main(String[] args) {
        
        // A cada 100 pessoas que visualizam o anúncio 12 clicam nele;
        // A cada 20 pessoas que clicam no anúncio 3 compartilham nas redes sociais;
        // Cada compartilhamento nas redes sociais gera 40 novas visualizações;
        // 30 pessoas visualizam o anúncio original (não compartilhado) a cada R$ 1,00 investido;
        // O mesmo anúncio é compartilhado no máximo 4 vezes em sequência.
        
        // ( ( 1 ) anuncio é compartilhado ( x4 ) ( x ) cada compartilhamento gera ( 40 ) visualizações )
        
        float investimento = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe valor a ser investido R$: "));
        
        if ( investimento < 0.01 ) { 
            
            JOptionPane.showMessageDialog(null, "ALERTA: Favor informar valor acima de R$ 0,01!!! \n\n                    Tente novamente!");
            
        } else { 
            
            float anunciOriginal = ( ( investimento * 30 ) / 1 );
        
            float visualizacoes = ( ( anunciOriginal * 4 ) * 40 );
        
            float visualizacoesClicadas = ( ( visualizacoes * 12 ) / 100 );
        
            float compartilhamentos = ( ( visualizacoesClicadas * 3 ) / 20 );
            
            JOptionPane.showMessageDialog(null, "Projeção aproximada da quantidade máxima de pessoas que visualizarão o mesmo anúncio: \n\n\nValor investido R$ "
            + investimento + "\n\nTotal de anúncio original (não compartilhado): " + Math.round(anunciOriginal) + "\n\nTotal de visualizações: " 
            + Math.round(visualizacoes) + "\n\nTotal de visualizações clicadas: " + Math.round(visualizacoesClicadas) +  "\n\nTotal de compartilhamentos : " 
            + Math.round(compartilhamentos) + "\n\n\n                                                            Programa finalizado!");
        
        }
        
    }
}