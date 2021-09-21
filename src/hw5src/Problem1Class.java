package hw5src;

public class Problem1Class {
	
	private boolean applyRockets;
	private double retroForce;
	public enum motorStates {Off,On};
	private motorStates ms;

	public void retroRocket (double AGL, double velocity, boolean autoLandEng) {
		ms=motorStates.On;
		if (AGL >= 5_000.0)
			retroForce=1.0;
		else
			if (AGL > 2_500.0)
				retroForce=0.95;
			else
				if (AGL >= 1_250.0)
					retroForce=0.925;
				else
					if (AGL > 500.0)
						retroForce=0.9;
					else {
						retroForce=0.85;
						if (AGL < 0.1)
							ms=motorStates.Off;}

		applyRockets = AGL <= 10_000.0 && velocity >= 250.0 && velocity < 5_000.0 && autoLandEng;
	}
	public boolean isApplyRockets() {
		return applyRockets;
	}
	public void setApplyRockets(boolean applyRockets) {
		this.applyRockets = applyRockets;
	}
	public double getRetroForce() {
		return retroForce;
	}
	public void setRetroForce(double retroForce) {
		this.retroForce = retroForce;
	}
	public motorStates getMs() {
		return ms;
	}
	public void setMs(motorStates ms) {
		this.ms = ms;
	}
}