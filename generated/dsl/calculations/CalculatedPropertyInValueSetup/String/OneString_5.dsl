module CalculatedPropertyInValueSetup
{
  value OneString_5 {
    String oneString;

    calculated String calculatedOneString from 'it => it.oneString';

    calculated String persistedOneString from 'it => it.oneString' { persisted; }
  }
}
