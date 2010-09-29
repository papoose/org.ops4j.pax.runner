/**
 *
 * Copyright 2010 (C) The original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.runner.platform.papoose.internal;

import java.util.logging.Logger;

import org.ops4j.pax.runner.platform.PlatformBuilder;
import org.ops4j.pax.runner.platform.builder.AbstractPlatformBuilderActivator;
import org.osgi.framework.BundleContext;


/**
 * Bundle activator for Papoose platform.
 *
 * @author Alan D. Cabrera
 * @see org.ops4j.pax.runner.platform.builder.AbstractPlatformBuilderActivator
 * @since September 04, 2010
 */
public final class Activator
    extends AbstractPlatformBuilderActivator
{

    /**
     * {@inheritDoc}
     */
    @Override
    protected PlatformBuilder[] createPlatformBuilders( final BundleContext bundleContext )
    {
        return new PlatformBuilder[]{
            new PapoosePlatformBuilder( bundleContext, "1.0.0" ),
            new PapoosePlatformBuilderSnapshot( bundleContext )
        };
    }

}

