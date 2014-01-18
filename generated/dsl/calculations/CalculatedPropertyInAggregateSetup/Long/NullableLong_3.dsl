module CalculatedPropertyInAggregateSetup
{
  aggregate NullableLong_3 {
    Long? nullableLong;

    calculated Long? calculatedNullableLong from 'it => it.nullableLong';

    calculated Long? persistedNullableLong from 'it => it.nullableLong' { persisted; }
  }
}
