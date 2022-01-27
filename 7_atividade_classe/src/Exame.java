
public abstract class Exame extends servicoOdontologico {
	private String tipoDeExame;
	private String diagnostico;
	
	public String getTipoDeExame() {
		return tipoDeExame;
	}
	public void setTipoDeExame(String tipoDeExame) {
		this.tipoDeExame = tipoDeExame;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	
}
