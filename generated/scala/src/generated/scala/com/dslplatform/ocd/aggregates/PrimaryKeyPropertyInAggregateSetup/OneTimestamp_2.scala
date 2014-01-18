package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneTimestamp_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneTimestamp: org.joda.time.DateTime
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneTimestamp_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneTimestamp_2("+ URI +")"

   def copy(oneTimestamp: org.joda.time.DateTime = this._oneTimestamp): OneTimestamp_2 = {

  require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_2(_URI = this.URI, __locator = this.__locator, _oneTimestamp = oneTimestamp)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneTimestamp_2): this.type = {
    this._URI = result._URI
    this._oneTimestamp = result._oneTimestamp
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneTimestamp_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("oneTimestamp")
  def oneTimestamp = {
    _oneTimestamp
  }

  def oneTimestamp_= (value: org.joda.time.DateTime) {
    _oneTimestamp = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneTimestamp") oneTimestamp: org.joda.time.DateTime
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneTimestamp = if (oneTimestamp == null) org.joda.time.DateTime.now else oneTimestamp)

}

object OneTimestamp_2 extends AggregateRootCompanion[OneTimestamp_2]{

  def apply(
    oneTimestamp: org.joda.time.DateTime = org.joda.time.DateTime.now
  ) = {
    require(oneTimestamp ne null, "Null value was provided for property \"oneTimestamp\"")
    new OneTimestamp_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneTimestamp = oneTimestamp)
  }

}
