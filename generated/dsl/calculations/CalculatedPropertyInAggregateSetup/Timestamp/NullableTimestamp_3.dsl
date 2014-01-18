module CalculatedPropertyInAggregateSetup
{
  aggregate NullableTimestamp_3 {
    Timestamp? nullableTimestamp;

    calculated Timestamp? calculatedNullableTimestamp from 'it => it.nullableTimestamp';

    calculated Timestamp? persistedNullableTimestamp from 'it => it.nullableTimestamp' { persisted; }
  }
}
