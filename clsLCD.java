package TugasLCD;

public class clsLCD {
        private String Status, Cable;
        private int Volume, Brightness, CableType;
    
        public clsLCD() {
            this.Status = "";
            this.Volume = 50;
            this.Brightness = 50;
            this.Cable = "";
        }

        public void setCable(int CableType) {
            this.CableType = CableType;
            setCable();
        }
    
        public void turnOff() {
            this.Status = "Off";
        }
    
        public void turnOn() {
            this.Status = "On";
        }
    
        public void freeze() {
            this.Status = "Freeze";
        }
    
        public void volumeUp() {
            this.Volume++;
        }
    
        public void volumeDown() {
            this.Volume--;
        }
    
        public void setVolume(int volume) {
            this.Volume = volume;
        }
    
        public void brightnessUp() {
            this.Brightness++;
        }
    
        public void brightnessDown() {
            this.Brightness--;
        }
    
        public void setBrightness(int brightness) {
            this.Brightness = brightness;
        }

        public void setCableUp(){
            this.CableType++;
            cableCheck();
            setCable();
        }

        public void setCableDown(){
            this.CableType--;
            cableCheck();
            setCable();
        }

        public void cableCheck(){
            if (this.CableType > 4 ) {
                this.CableType = 1;
            }
        }
        
        public void setCable(){

            switch (CableType) {
                case 1 :
                    Cable = "VGA";
                    break;
                case 2 :
                    Cable = "DVI";
                    break;
                case 3 :
                    Cable = "HDMI";
                    break;
                case 4 :
                    Cable = "DisplayPort";
                    break;
                default:
                    Cable = "Unknown";
                    break;
            }
        }

        public void display() {
            System.out.println("LCD Status\t: " + this.Status);
            System.out.println("Volume\t\t: " + this.Volume);
            System.out.println("Brightness\t: " + this.Brightness);
            System.out.println("Cable\t\t: " + Cable );
            System.out.println("");
        }
}   