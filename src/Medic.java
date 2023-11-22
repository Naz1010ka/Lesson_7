public class Medic extends Hero{

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность ANIMATE");

    }
    int healPoints = 60;
    public void increaseExperience(){
        System.out.println(" MEDIC увеличил количество единиц лечения: " + (this.healPoints * 10) );
    }





}
