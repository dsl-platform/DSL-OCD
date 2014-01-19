module CalculatedPropertyInValueSetup
{
  value NullableLong_4 {
    Long? nullableLong;

    calculated Long? calculatedNullableLong from 'it => it.nullableLong';

    calculated Long? persistedNullableLong from 'it => it.nullableLong' { persisted; }
  }
}
