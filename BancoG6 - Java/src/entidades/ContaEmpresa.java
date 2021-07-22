package entidades;

import java.util.Scanner;
public class ContaEmpresa extends Contag6 {
        private double limiteEmprestimo;
        private double emprestimo;
        private char opcaoLetra;
        
        public double getValorEmprestimo() {
            return emprestimo;
        }
        
        public void setValorEmprestimo(double valorEmprestimo) {
            this.emprestimo = valorEmprestimo;
        }
        
        public char getOpcaoLetra() {
            return opcaoLetra;
        }
        
        public void setOpcaoLetra(char opcaoLetra) {
            this.opcaoLetra = opcaoLetra;
        }
        
        Scanner leia = new Scanner(System.in);
        public ContaEmpresa(int numero, String nomeCliente, double limiteEmprestimo) {
            super(numero, nomeCliente);
            this.limiteEmprestimo = limiteEmprestimo;
        }
        
        public double getLimiteEmprestimo() {
            return limiteEmprestimo;
        }

        public void usarLimiteEmprestimo(double valor) {
            super.credito(valor);
            this.limiteEmprestimo = limiteEmprestimo - valor;

        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        //public void menuEmpresa( ) {

       // String menuEmpresa[] = {"Débito", "Crédito", "Saldo","Empréstimo", "Sair"};

        //for(int x = 0; x<menuEmpresa.length; x++) {
          //  System.out.print((x+1) + " - " + menuEmpresa[x] + "\n");
        // }
// }
        public void emprestimoEmpresa (double valorEmprestimo) {
            if (valorEmprestimo <=0 && valorEmprestimo> limiteEmprestimo) {
            System.out.println("Valor solicitado invalido");
         } 
        else if (valorEmprestimo < limiteEmprestimo){
            super.saldo+=valorEmprestimo;
            limiteEmprestimo-=valorEmprestimo;
            System.out.println("Saldo atual de:"+saldo);
       }
  }
}