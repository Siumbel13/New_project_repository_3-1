public class BonusMilesService {

    public int calculate(int price) {
        int calculate = price / 20; //за каждые 20 рублей, потраченные на билет, начисляется 1 миля

        return calculate;
    }
}
