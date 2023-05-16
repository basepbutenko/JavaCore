
class ElectricGuitar {
    String brand;
    /* объявление переменной. Не указано не public or private значит это package-private,
    что означает возможность ссылаться если находятся в одном пакете
     */
    private int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNum0fPickups() {
        return numOfPickups;
    }

    void setNumofPickups(int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean vesOrNo) {
        rockStarUsesIt = vesOrNo;
    }
}

