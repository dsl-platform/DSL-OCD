module CalculatedPropertyInValueSetup
{
  value OneFloat_5 {
    Float oneFloat;

    calculated Float calculatedOneFloat from 'it => it.oneFloat';

    calculated Float persistedOneFloat from 'it => it.oneFloat' { persisted; }
  }
}
