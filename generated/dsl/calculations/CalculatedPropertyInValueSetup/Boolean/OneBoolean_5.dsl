module CalculatedPropertyInValueSetup
{
  value OneBoolean_5 {
    Boolean oneBoolean;

    calculated Boolean calculatedOneBoolean from 'it => it.oneBoolean';

    calculated Boolean persistedOneBoolean from 'it => it.oneBoolean' { persisted; }
  }
}
