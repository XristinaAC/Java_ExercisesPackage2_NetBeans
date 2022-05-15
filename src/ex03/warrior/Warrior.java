package ex03.warrior;

public interface Warrior {
    void attack(Warrior adversary);
    boolean isDefeated();
    int getHealthCondition();
    void setHealthCondition(int condition);
    int getPower();
    String getCallSign(); 
}
