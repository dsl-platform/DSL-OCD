module CalculatedPropertyInValueSetup
{
  value NullableInteger_4 {
    Integer? nullableInteger;

    calculated Integer? calculatedNullableInteger from 'it => it.nullableInteger';

    calculated Integer? persistedNullableInteger from 'it => it.nullableInteger' { persisted; }
  }
}
