module CalculatedPropertyInValueSetup
{
  value OneInteger_5 {
    Integer oneInteger;

    calculated Integer calculatedOneInteger from 'it => it.oneInteger';

    calculated Integer persistedOneInteger from 'it => it.oneInteger' { persisted; }
  }
}
