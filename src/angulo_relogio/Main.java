package angulo_relogio;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora;
		int minutos;
		int angulo;
		
		do {
			hora = Integer.parseInt(JOptionPane.showInputDialog("Digite a Hora:"));
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite os Minutos:"));
		} while(hora <= 0 || hora >= 24 || minutos <= 0 || minutos >= 59);
		
		AnguloRelogio ang = new AnguloRelogio();
		angulo = ang.retornaAnguloRelogio(hora, minutos);
		JOptionPane.showMessageDialog(null, "Primeiro Angulo: " + 
				angulo + " Segundo Angulo: " + (360 - angulo));
		
	}

}
