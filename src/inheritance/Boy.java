package inheritance;

public class Boy extends Person {
    private boolean isHasMilitaryService;

    public boolean isHasMilitaryService() {
        return isHasMilitaryService;
    }

    public void setHasMilitaryService(boolean hasMilitaryService) {
        isHasMilitaryService = hasMilitaryService;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("as aboy");
    }
}
