package io.quarkiverse.restlint.deployment;

import io.quarkus.builder.item.MultiBuildItem;

public final class ErrorBuildItem extends MultiBuildItem {

    private final String message;
    private final String methodName;
    private final String className;

    public ErrorBuildItem(String message, String methodName, String className) {
        this.message = message;
        this.methodName = methodName;
        this.className = className;
    }

    public String getMessage() {
        return message;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getClassName() {
        return className;
    }
}
