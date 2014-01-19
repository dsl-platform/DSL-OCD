module CalculatedPropertyInValueSetup
{
  value OneRectangle_4 {
    Rectangle oneRectangle;

    calculated Rectangle calculatedOneRectangle from 'it => it.oneRectangle';

    calculated Rectangle persistedOneRectangle from 'it => it.oneRectangle' { persisted; }
  }
}
