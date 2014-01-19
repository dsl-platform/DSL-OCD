module CalculatedPropertyInValueSetup
{
  value NullableBinary_4 {
    Binary? nullableBinary;

    calculated Binary? calculatedNullableBinary from 'it => it.nullableBinary';

    calculated Binary? persistedNullableBinary from 'it => it.nullableBinary' { persisted; }
  }
}
