public class yhatzee
{
  Die6 die1;
  Die6 die2;
  Die6 die3;
  Die6 die4;
  Die6 die5;
  Die6 die6;
  public yhatzee() {
    die1 = new Die6();
    die2 = new Die6();
    die3 = new Die6();
    die4 = new Die6();
    die5 = new Die6();
    die6 = new Die6();
  }
  public void roll() {
    die1.roll();
    die2.roll();
    die3.roll();
    die4.roll();
    die5.roll();
    die6.roll();
  }
  public int getValue() {
    return die1.getvalue();
    return die2.getvalue();
    return die3.getvalue();
    return die4.getvalue();
    return die5.getvalue();
    return die6.getvalue();
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }

}

