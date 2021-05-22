package angulo_relogio;

public class AnguloRelogio {
	private int angulo;
	private int aux;

	public int retornaAnguloRelogio(int horario, int minutos) {
		aux = minutos * 6;
		if(horario > 12) {
			horario = horario - 12;
		}
		angulo = horario * 30;
		if(angulo > aux) {
			angulo = angulo - aux;
			return angulo;
		}
		angulo = aux - angulo;
		return angulo;
		
	}

}
