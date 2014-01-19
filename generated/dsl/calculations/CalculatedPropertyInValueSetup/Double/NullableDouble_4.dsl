module CalculatedPropertyInValueSetup
{
  value NullableDouble_4 {
    Double? nullableDouble;

    calculated Double? calculatedNullableDouble from 'it => it.nullableDouble';

    calculated Double? persistedNullableDouble from 'it => it.nullableDouble' { persisted; }
  }
}
