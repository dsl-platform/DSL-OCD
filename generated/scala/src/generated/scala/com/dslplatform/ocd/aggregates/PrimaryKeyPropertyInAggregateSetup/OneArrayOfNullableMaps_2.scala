package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneArrayOfNullableMaps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneArrayOfNullableMaps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneArrayOfNullableMaps_2("+ URI +")"

   def copy(oneArrayOfNullableMaps: Array[Option[Map[String, String]]] = this._oneArrayOfNullableMaps): OneArrayOfNullableMaps_2 = {

  require(oneArrayOfNullableMaps ne null, "Null value was provided for property \"oneArrayOfNullableMaps\"")
  com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMaps)
    new OneArrayOfNullableMaps_2(_URI = this.URI, __locator = this.__locator, _oneArrayOfNullableMaps = oneArrayOfNullableMaps)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableMaps_2): this.type = {
    this._URI = result._URI
    this._oneArrayOfNullableMaps = result._oneArrayOfNullableMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneArrayOfNullableMaps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneArrayOfNullableMaps")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneArrayOfNullableMaps = {
    _oneArrayOfNullableMaps
  }

  def oneArrayOfNullableMaps_= (value: Array[Option[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(value)
    _oneArrayOfNullableMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneArrayOfNullableMaps") oneArrayOfNullableMaps: Array[Option[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneArrayOfNullableMaps = if (oneArrayOfNullableMaps == null) Array.empty else oneArrayOfNullableMaps)

}

object OneArrayOfNullableMaps_2 extends AggregateRootCompanion[OneArrayOfNullableMaps_2]{

  def apply(
    oneArrayOfNullableMaps: Array[Option[Map[String, String]]] = Array.empty
  ) = {
    com.dslplatform.api.Guards.checkArrayOptionRefNulls(oneArrayOfNullableMaps)
    require(oneArrayOfNullableMaps ne null, "Null value was provided for property \"oneArrayOfNullableMaps\"")
    new OneArrayOfNullableMaps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneArrayOfNullableMaps = oneArrayOfNullableMaps)
  }

}
