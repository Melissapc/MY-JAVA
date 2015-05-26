public class Hero
{

  private int strength;

  private int wisdom;

  private int magic;

  private String name;

  private String heroType;

public Hero(String name)
{

  this.name = name;

  heroType = "";

  strength = 0;

  wisdom = 0;

  magic = 0;

}

public int getStrength()
{
  return strength;
}

public void setStrength(int strength)
{
  this.strength = strength;
}

public int getWisdom()
{
  return wisdom;
}

public void setWisdom(int wisdom)
{
  this.wisdom = wisdom;
}

public int getMagic()
{
  return magic;
}

public void setMagic(int magic)
{
  this.magic = magic;
}

public String getName()
{
  return name;
}

public void setName(String name)
{
  this.name = name;
}

public String getHeroType()
{
  return heroType;
  
}

public void setHeroType(String heroType)
{
  this.heroType = heroType;
 
}

}

