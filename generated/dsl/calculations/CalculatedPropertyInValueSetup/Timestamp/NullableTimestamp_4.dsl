module CalculatedPropertyInValueSetup
{
  value NullableTimestamp_4 {
    Timestamp? nullableTimestamp;

    calculated Timestamp? calculatedNullableTimestamp from 'it => it.nullableTimestamp';

    calculated Timestamp? persistedNullableTimestamp from 'it => it.nullableTimestamp' { persisted; }
  }
}
