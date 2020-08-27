public class Wall {

    private double width;
    private double height;

    public Wall(){

    }

    public Wall( double Width, double Height){
        if(Width<0){
            this.width = 0;
        } else {
            this.width = Width;
        }

        if(Height<0){
            this.height=0;
        }
        else{
            this.height=Height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double Width) {
        if(Width<0){
            this.width = 0;
        } else {
            this.width = Width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double Height){

        if(Height<0){
            this.height=0;
        }
        else{
            this.height=Height;
        }

    }

    public double getArea() {
        return height * width;
    }
}

