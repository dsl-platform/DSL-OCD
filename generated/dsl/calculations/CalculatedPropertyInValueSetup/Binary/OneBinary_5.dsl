module CalculatedPropertyInValueSetup
{
  value OneBinary_5 {
    Binary oneBinary;

    calculated Binary calculatedOneBinary from 'it => it.oneBinary';

    calculated Binary persistedOneBinary from 'it => it.oneBinary' { persisted; }
  }
}
