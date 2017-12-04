package was3;

public class Punkt {
    int x;
    int y;

    int getX(){
        return this.x;
    }

    void setX(int nowyX) {
        this.x=nowyX;
    }

    int getY() {
        return this.y;
    }
    void setY(int nowyY){
        this.y=nowyY;
    }
    void przesunOAB(int a, int b){
        this.x=x+a;
        this.y=y+b;
    }
}
