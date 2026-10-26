# DemoApp

Android приложение с анимированным квадратом.

## Описание

Простое Android приложение с:
- Темным фоном
- Анимированным квадратом tomato цвета с эффектом свечения
- Анимацией прыжка (квадрат прыгает вверх и падает вниз циклично)
- Кнопкой для смены цвета квадрата на случайный

## Сборка

### Локальная сборка (если установлен JDK и Android SDK)
```bash
./gradlew assembleDebug
```

APK будет в: `app/build/outputs/apk/debug/app-debug.apk`

### Сборка через GitHub Actions

1. Создай репозиторий на GitHub
2. Загрузи этот проект
3. Перейди в Actions
4. Workflow автоматически соберет APK
5. Скачай APK из раздела Artifacts

## Структура проекта

```
TestProject/
├── .github/
│   └── workflows/
│       └── android-build.yml    # GitHub Actions workflow
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/demo/app/
│   │       │   └── MainActivity.java
│   │       ├── res/
│   │       │   ├── anim/
│   │       │   │   └── bounce.xml
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       └── strings.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties
├── build.gradle
├── settings.gradle
└── gradlew.bat
```

## Системные требования

- Android 7.0 (API 24) или выше
- ~10MB свободного места

## Возможности

- ✅ Автоматическая сборка через GitHub Actions
- ✅ Анимация прыжка квадрата
- ✅ Смена цвета на случайный
- ✅ Темная тема
- ✅ Эффект свечения (elevation)

## Лицензия

MIT
