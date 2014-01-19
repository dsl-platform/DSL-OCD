module CalculatedPropertyInValueSetup
{
  value OneImage_5 {
    Image oneImage;

    calculated Image calculatedOneImage from 'it => it.oneImage';

    calculated Image persistedOneImage from 'it => it.oneImage' { persisted; }
  }
}
