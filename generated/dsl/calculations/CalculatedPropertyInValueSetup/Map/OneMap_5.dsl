module CalculatedPropertyInValueSetup
{
  value OneMap_5 {
    Map oneMap;

    calculated Map calculatedOneMap from 'it => it.oneMap';

    calculated Map persistedOneMap from 'it => it.oneMap' { persisted; }
  }
}
