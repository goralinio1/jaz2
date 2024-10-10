package org.example.tools.abstractions;

import java.lang.reflect.Method;

public interface IParse<TResult> {

    TResult parse(String line);
}
