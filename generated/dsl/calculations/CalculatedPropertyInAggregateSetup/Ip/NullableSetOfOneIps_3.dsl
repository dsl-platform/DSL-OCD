module CalculatedPropertyInAggregateSetup
{
  aggregate NullableSetOfOneIps_3 {
    Set<Ip>? nullableSetOfOneIps;

    calculated Set<Ip>? calculatedNullableSetOfOneIps from 'it => it.nullableSetOfOneIps';

    calculated Set<Ip>? persistedNullableSetOfOneIps from 'it => it.nullableSetOfOneIps' { persisted; }
  }
}
