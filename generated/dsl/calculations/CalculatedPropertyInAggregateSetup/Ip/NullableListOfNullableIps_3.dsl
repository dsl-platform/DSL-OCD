module CalculatedPropertyInAggregateSetup
{
  aggregate NullableListOfNullableIps_3 {
    List<Ip?>? nullableListOfNullableIps;

    calculated List<Ip?>? calculatedNullableListOfNullableIps from 'it => it.nullableListOfNullableIps';

    calculated List<Ip?>? persistedNullableListOfNullableIps from 'it => it.nullableListOfNullableIps' { persisted; }
  }
}
