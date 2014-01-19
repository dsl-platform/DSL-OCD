package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneUrl_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneUrl: java.net.URI
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneUrl_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneUrl_2("+ URI +")"

   def copy(oneUrl: java.net.URI = this._oneUrl): OneUrl_2 = {

  require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")
    new OneUrl_2(_URI = this.URI, __locator = this.__locator, _oneUrl = oneUrl)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneUrl_2): this.type = {
    this._URI = result._URI
    this._oneUrl = result._oneUrl
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneUrl_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneUrl")
  def oneUrl = {
    _oneUrl
  }

  def oneUrl_= (value: java.net.URI) {
    _oneUrl = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneUrl") oneUrl: java.net.URI
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneUrl = if (oneUrl == null) null else oneUrl)

}

object OneUrl_2 extends AggregateRootCompanion[OneUrl_2]{

  def apply(
    oneUrl: java.net.URI = null
  ) = {
    require(oneUrl ne null, "Null value was provided for property \"oneUrl\"")
    new OneUrl_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneUrl = oneUrl)
  }

}
