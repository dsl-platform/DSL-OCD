module CalculatedPropertyInAggregateSetup
{
  aggregate NullableDouble_3 {
    Double? nullableDouble;

    calculated Double? calculatedNullableDouble from 'it => it.nullableDouble';

    calculated Double? persistedNullableDouble from 'it => it.nullableDouble' { persisted; }
  }
}
