module CalculatedPropertyInValueSetup
{
  value NullableLocation_4 {
    Location? nullableLocation;

    calculated Location? calculatedNullableLocation from 'it => it.nullableLocation';

    calculated Location? persistedNullableLocation from 'it => it.nullableLocation' { persisted; }
  }
}
