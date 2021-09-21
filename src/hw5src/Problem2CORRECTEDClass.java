package hw5src;

public class Problem2CORRECTEDClass {

	public enum gDoorStates {Start,S0,S1,S2,S3};
	private gDoorStates state;
	private boolean T, B, O, R, DR, LO, DS;

	public void garageDoorOpener (gDoorStates state) {
		switch (state) {
			case Start:
				DR=false;
				LO=false;
				DS=false;
			case S0:
				if (T||B||R) {
					DR=false;
					LO=false;
					DS=true;
					state=gDoorStates.S1;
				}
				else {
					DR=true;
					LO=true;
					DS=false;
					state=gDoorStates.S0;
				}
				break;
			case S1:
				if (B||O) {
					DR=true;
					LO=true;
					DS=false;
					state=gDoorStates.S1;					
				}
				else
					if (T) {
						DR=false;
						LO=false;
						DS=true;
						state=gDoorStates.S2;						
					}
					DR=false;
					LO=true;
					DS=false;
					state=gDoorStates.S3;
				break;
			case S2:
				if (T||B||O) {
					DR=false;
					LO=false;
					DS=false;
					state=gDoorStates.S2;
				}
				else {
					DR=false;
					LO=true;
					DS=false;
					state=gDoorStates.S3;					
				}
			case S3:
				if (T) {
					DR=false;
					LO=true;
					DS=false;
					state=gDoorStates.S3;										
				}
				else
					if (B) {
						DR=false;
						LO=false;
						DS=true;
						state=gDoorStates.S2;												
					}
					else {
						DR=true;
						LO=true;
						DS=false;
						state=gDoorStates.S1;
					}
				break;
		}
	}

	public gDoorStates getState() {
		return state;
	}

	public void setState(gDoorStates state) {
		this.state = state;
	}

	public boolean isT() {
		return T;
	}

	public void setT(boolean t) {
		T = t;
	}

	public boolean isB() {
		return B;
	}

	public void setB(boolean b) {
		B = b;
	}

	public boolean isO() {
		return O;
	}

	public void setO(boolean o) {
		O = o;
	}

	public boolean isR() {
		return R;
	}

	public void setR(boolean r) {
		R = r;
	}

	public boolean isDR() {
		return DR;
	}

	public void setDR(boolean dR) {
		DR = dR;
	}

	public boolean isLO() {
		return LO;
	}

	public void setLO(boolean lO) {
		LO = lO;
	}

	public boolean isDS() {
		return DS;
	}

	public void setDS(boolean dS) {
		DS = dS;
	}
}