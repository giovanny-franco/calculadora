package calculator;
import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String[] args) {
        
        String numum = JOptionPane.showInputDialog("Digite o primeiro número:");
        int num1 = Integer.parseInt(numum);
        
        String numdois = JOptionPane.showInputDialog("Digite o segundo número:");
        int num2 = Integer.parseInt(numdois);
        
        String a = JOptionPane.showInputDialog("Selecione uma operação \n + (soma) \n - (subtração) \n * (multiplicação) \n / (divisão)");

        double resp;
                
        switch(a){
            case "+":
                resp = num1 + num2;
                JOptionPane.showMessageDialog(null, resp, "resultado",JOptionPane.PLAIN_MESSAGE);
                break;
        
            case "-":
                resp = num1 - num2;
                JOptionPane.showMessageDialog(null, resp, "resultado",JOptionPane.PLAIN_MESSAGE);
                break;
        
            case "*":
                resp = num1 * num2;
                JOptionPane.showMessageDialog(null, resp, "resultado",JOptionPane.PLAIN_MESSAGE);
                break;
        
            case "/":
                if(num2 == 0){
                  JOptionPane.showMessageDialog(null, "não é possível dividir por zero", a, JOptionPane.PLAIN_MESSAGE);  
                }else{
                     resp = num1 / num2;
                JOptionPane.showMessageDialog(null, resp, "resultado",JOptionPane.PLAIN_MESSAGE);                
                }
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Operação não existente", a, 0);
                break;
        }
    }
    
}
