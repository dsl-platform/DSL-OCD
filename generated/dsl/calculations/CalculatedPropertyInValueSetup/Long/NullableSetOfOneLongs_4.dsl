module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneLongs_4 {
    Set<Long>? nullableSetOfOneLongs;

    calculated Set<Long>? calculatedNullableSetOfOneLongs from 'it => it.nullableSetOfOneLongs';

    calculated Set<Long>? persistedNullableSetOfOneLongs from 'it => it.nullableSetOfOneLongs' { persisted; }
  }
}
