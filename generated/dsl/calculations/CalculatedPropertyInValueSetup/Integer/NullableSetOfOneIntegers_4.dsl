module CalculatedPropertyInValueSetup
{
  value NullableSetOfOneIntegers_4 {
    Set<Integer>? nullableSetOfOneIntegers;

    calculated Set<Integer>? calculatedNullableSetOfOneIntegers from 'it => it.nullableSetOfOneIntegers';

    calculated Set<Integer>? persistedNullableSetOfOneIntegers from 'it => it.nullableSetOfOneIntegers' { persisted; }
  }
}
