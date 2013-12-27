package com.dslplatform.ocd.test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

public class TypeTester {
  private final Type type;

  private TypeTester(
      final Type type) {
    this.type = type;
  }

  public static TypeTester testField(
      final Class<?> clazz,
      final String name) throws SecurityException, NoSuchFieldException {
    return new TypeTester(
        clazz.getDeclaredField(name).getGenericType());
  }

  public static TypeTester testGetter(
      final Class<?> clazz,
      final String name) throws NoSuchMethodException {
    return new TypeTester(
        clazz.getDeclaredMethod(name).getGenericReturnType());
  }

  public static TypeTester testSetter(
      final Class<?> clazz,
      final String name,
      final Class<?> argument,
      final Class<?>... typeParameters) throws NoSuchMethodException {

    final Method method = clazz.getDeclaredMethod(name, argument);
    if (typeParameters.length > 0) {
      final Type[] argumentTypes =
          ((ParameterizedType) method.getGenericParameterTypes()[0]).getActualTypeArguments();

      if (!Arrays.equals(argumentTypes, typeParameters))
        throw new NoSuchMethodException("Could not locate method with such type parameters!");
    }

    return new TypeTester(
        method.getGenericReturnType());
  }

  public boolean resultEquals(
      final Class<?> rawType,
      final Class<?>... typeParameters) {
    if (type instanceof ParameterizedType) {
      final ParameterizedType pType = (ParameterizedType) type;

      if (pType.getRawType() != (Type) rawType)
        return false;

      final Type[] arguments = pType.getActualTypeArguments();
      return Arrays.equals(arguments, typeParameters);
    }

    return type == rawType;
  }
}
