module CalculatedPropertyInValueSetup
{
  value OneDouble_5 {
    Double oneDouble;

    calculated Double calculatedOneDouble from 'it => it.oneDouble';

    calculated Double persistedOneDouble from 'it => it.oneDouble' { persisted; }
  }
}
