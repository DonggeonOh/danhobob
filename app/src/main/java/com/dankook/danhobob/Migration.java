package com.dankook.danhobob;

import io.realm.DynamicRealm;
import io.realm.FieldAttribute;
import io.realm.RealmMigration;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;

public class Migration implements RealmMigration {
    @Override
    public void migrate(DynamicRealm realm, long oldVersion, long newVersion) {
        RealmSchema schema = realm.getSchema();

        if (oldVersion == 0) {
            RealmObjectSchema mFoodSchema = schema.create("FoodData5");
            mFoodSchema
                    .addField("id", int.class, FieldAttribute.PRIMARY_KEY)
                    .addField("name", String.class, null)
                    .addField("preference", int.class, null)
                    .addField("category", String.class, null)
                    .addField("texture", String.class, null)
                    .addField("flavor", String.class, null)
                    .addField("weather", String.class, null)
                    .addField("time", int.class, null)
                    .addField("temperature", String.class, null)
                    .addField("allergic", String.class, null)
                    .addField("ingredient", String.class, null)
                    .addField("preference2", int.class, null);
            oldVersion ++;
        }
    }
}
