package paquete1;

public enum Operaciones {
	SUM("+") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1+ope2;
		}
	},
	RES("-") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1-ope2;
		}
	},
	MULTI("*") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1*ope2;
		}
	},
	DIV("/") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1/ope2;
		}
	};
	
	private String tipo;
	
	Operaciones(String tipo){
		this.tipo=tipo;
	}
	public abstract double resultado(double ope1, double ope2);
}
