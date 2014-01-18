module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfNullableIps_3 {
    Set<Ip?>? nullableSetOfNullableIps;

    calculated Set<Ip?>? calculatedNullableSetOfNullableIps from 'it => it.nullableSetOfNullableIps';

    calculated Set<Ip?>? persistedNullableSetOfNullableIps from 'it => it.nullableSetOfNullableIps' { persisted; }
  }
}
