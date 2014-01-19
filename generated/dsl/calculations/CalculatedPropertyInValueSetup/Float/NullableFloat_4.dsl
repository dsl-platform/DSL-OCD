module CalculatedPropertyInValueSetup
{
  value NullableFloat_4 {
    Float? nullableFloat;

    calculated Float? calculatedNullableFloat from 'it => it.nullableFloat';

    calculated Float? persistedNullableFloat from 'it => it.nullableFloat' { persisted; }
  }
}
